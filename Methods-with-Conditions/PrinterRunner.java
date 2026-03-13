class PrinterRunner {

    public static void main(String[] args){

        Printer.on();

        Printer.addPaper();
        int paper = Printer.paperCount;
        System.out.println("Paper Count: " + paper);

        Printer.removePaper();
        int paperAfter = Printer.paperCount;
        System.out.println("Paper After Use: " + paperAfter);

        Printer.off();
    }
}