package exceptions;

public class Exceptions {
    public static class HoldingException extends RuntimeException{
        public HoldingException(String s){
            super(s);
        }
    }
    public static class StoryException extends Exception{
        public StoryException(String s){
            super(s);
        }
    }
}
