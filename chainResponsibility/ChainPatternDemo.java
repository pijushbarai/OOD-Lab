// package chainResponsibility;

public class ChainPatternDemo {
    private static AbstractLogger getChainOfLogger(){
        AbstractLogger errorLoger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLoger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLoger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLogger();
        loggerChain.logMesseage(AbstractLogger.INFO,"this is an Information");
        loggerChain.logMesseage(AbstractLogger.DEBUG,"This is an Debug");
        loggerChain.logMesseage(AbstractLogger.ERROR, "this is an error");
    }
    
}
