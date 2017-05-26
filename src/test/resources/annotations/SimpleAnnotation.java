package annotations;

@interface Indexed {
}

@Indexed
class Annotated {
	@Indexed
	public String field;
}