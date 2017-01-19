package sharpen.core.framework;

import org.eclipse.jdt.core.dom.*;

import java.util.HashMap;
import java.util.Map;

public class PreConvertVisitor extends ASTVisitor {

    private final Map<String, String> renamingMap = new HashMap<>();

    @Override
    public boolean visit(TypeDeclaration node) {
        renameFieldsAmbiguousToMethods(node);
        return false;
    }

    private void renameFieldsAmbiguousToMethods(TypeDeclaration node) {
        for (FieldDeclaration field : node.getFields()) {
            for (Object item : field.fragments()) {
                VariableDeclarationFragment fragment = (VariableDeclarationFragment) item;
                String fieldName = fragment.getName().getIdentifier();
                if (ASTUtility.hasMethodWithName(node, fieldName)) {
                    renamingMap.put(fragment.getName().resolveBinding().getKey(), "_" + fieldName);
                }
            }
        }
    }

    public Map<String, String> getRenamingMap() {
        return renamingMap;
    }

}
