package com.jm.poo.abstractVsInterface.interfaceExample;

public class InterfaceOfCdImplementation implements InterfaceOfCompactDisk {

    private static final String PRINT_FORMAT = "\n*********** CD-%s with %s cm of diameter have the following features: \n%s";

    String type;
    Integer diameter;

    public static void main(String[] args) {
        //diameter is just an assumption
        InterfaceOfCdImplementation cdRomReadOnly = new InterfaceOfCdImplementation("ROM", 12);
        InterfaceOfCdImplementation cdRecordable = new InterfaceOfCdImplementation("R", 11);
        InterfaceOfCdImplementation cdReWritable = new InterfaceOfCdImplementation("RW", 13);
        InterfaceOfCdImplementation cdDigitalAudio = new InterfaceOfCdImplementation("DA", 15);

        System.out.format(PRINT_FORMAT, cdRomReadOnly.getType(), cdRomReadOnly.getDiameter(), InterfaceOfCompactDisk.printDescription());
        System.out.format(PRINT_FORMAT, cdRecordable.getType(), cdRecordable.getDiameter(), InterfaceOfCompactDisk.printDescription());
        System.out.format(PRINT_FORMAT, cdReWritable.getType(), cdReWritable.getDiameter(), InterfaceOfCompactDisk.printDescription());
        System.out.format(PRINT_FORMAT, cdDigitalAudio.getType(), cdDigitalAudio.getDiameter(), InterfaceOfCompactDisk.printDescription());
    }

    public InterfaceOfCdImplementation(String type, Integer diameter) {
        this.type = type;
        this.diameter = diameter;
    }

    @Override
    public Integer getDiameter() {
        return this.diameter;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
