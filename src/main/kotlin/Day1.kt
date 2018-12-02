fun main(args: Array<String>) {
    println(
        java.util.regex.Pattern.compile("[ ]?,[ ]?")
            .splitAsStream("+13,-7,-17,+12,-11,+19,+18,+19,-8,+11,+7,-3,+7,-1,-16,+11,-2,-2,+20,+1,+17,+15,+4,-1,+7,+3,+17,+13,-8,+15,+18,-12,+3,-4,-14,+6,-7,+8,-9,+12,+7,+2,-8,-19,-12,+11,+13,+4,+13,+11,+19,+14,-12,-19,+1,-10,+20,-8,-15,+2,+7,-5,+10,+7,+19,-5,+11,-4,+15,+18,+13,+10,+1,+2,+6,+20,+5,-10,-2,-2,+12,-11,-13,-13,+16,+17,+17,-18,-13,-17,+19,-3,-11,-19,+1,-13,-6,-5,-19,+9,+1,+18,-7,-13,+3,-14,-10,+18,+17,+16,+9,+3,+7,-12,+6,+7,-19,-5,-8,-1,-13,+8,-3,-22,-17,-16,-11,+18,-14,-15,-17,-18,+9,-10,+14,+14,+4,+6,+2,+23,+18,+1,+20,-4,+12,+1,+17,-3,+4,+13,+7,+11,-12,-21,-18,+3,-27,-21,+13,+13,-1,-16,+6,+15,-7,-11,+43,+12,+2,+3,+15,+8,+14,+15,-16,-5,+7,+18,+17,+11,+3,+17,-14,+13,+16,+3,+19,-5,-7,-12,+9,-5,-5,+4,+19,+9,-6,+19,+1,+5,+15,-10,+5,+14,-4,-16,-1,-12,-12,+13,-8,+1,-14,-8,-6,-16,+6,+13,+8,-12,+8,-3,-16,+13,-10,-14,-8,-12,-9,+4,-1,+10,+15,-3,-15,+14,+3,-22,-17,-2,+11,-1,-3,-10,+11,-12,+3,+5,+17,+7,+3,-18,-22,-7,-17,+19,+15,+19,+17,-12,+9,-1,+11,+11,-6,-2,+1,+27,-15,+22,+10,+16,+10,+18,-1,-4,+9,+19,+15,+13,-16,-7,+18,+7,-19,-1,-3,-11,-1,-1,+14,+6,-10,+16,+19,+4,-18,-22,+16,+18,+13,-1,-20,+16,+10,+13,-2,-5,-15,-2,-4,+14,-16,-7,-5,-8,+6,+9,+2,-14,-8,-4,+18,+9,-4,+19,+30,+1,-7,+11,+8,+5,-8,+9,-7,+16,+17,+5,+9,-19,+14,+17,-8,+13,+3,-12,+10,+4,-7,-18,+12,+14,+16,+11,+8,-1,-8,-17,-6,+4,+10,+3,-10,+5,-9,-24,-4,+13,-1,+3,-14,+5,+4,-12,-6,-6,+16,-20,-34,-1,-12,+19,-18,-8,-13,-4,+10,+16,-4,-2,+1,+7,+17,-13,+6,+16,+14,+18,+21,+29,-1,-3,-34,-16,-15,-27,-5,-8,+19,+7,+10,+15,+2,-7,+11,-12,-21,-20,+19,+11,+3,+6,-52,-13,+3,-43,-19,-6,-4,-20,-6,+9,-5,+3,+17,-11,-17,-15,-16,-7,+12,+5,+11,+4,-14,-12,+10,+20,+7,+17,-19,-10,+6,-18,-9,+10,+24,+20,-2,+1,+7,-11,+10,+8,-4,-15,-11,-20,-1,-18,-13,+2,-25,-21,+10,+12,-49,+13,-4,-7,+17,+14,+17,-85,+8,-5,+16,+5,+17,-59,-4,-17,-28,-47,+27,-7,+16,-66,+7,-16,-1,-134,+22,+2,-31,+8,+11,-54,+7,-5,+21,-31,-4,-14,+12,+31,-14,-218,-82,-71530,+7,+11,+4,-10,-18,+5,-19,-4,-11,+4,+9,+1,-13,+7,+17,+16,-8,-6,+5,+14,+2,+2,-1,-9,-19,-19,-4,+18,+14,+6,-8,+3,-8,-1,-3,+19,+17,+11,+14,+17,+6,+14,-4,+15,-7,+18,+10,+15,-10,+1,+5,-19,+7,-16,-18,+2,-16,+18,+8,-6,+10,-1,+9,+5,-19,+9,+13,-6,-18,-12,-14,-7,-15,+7,-20,-5,+11,+12,+3,-20,-18,+10,+17,-3,+1,-9,+15,+3,-6,-20,+13,+5,-12,-13,-25,-2,-13,+1,-16,-17,+12,+18,-11,+15,+19,+11,+2,+4,+16,+14,+26,+2,-6,-12,+2,+1,+5,+1,+1,+14,+4,-13,-21,+7,+3,+25,+19,+11,-6,-2,+19,+4,+6,+2,-18,+11,+22,+16,-10,-3,+18,+8,+14,+15,+10,+8,-3,+12,-8,-7,-3,-12,+2,+7,+16,+13,-12,+15,-18,+4,-16,-4,-13,+10,+4,+20,-4,+13,-17,-3,-12,-14,-7,+9,-3,+9,-1,+3,-24,+4,+2,-10,+19,+24,-10,-11,-6,+21,-23,-22,-5,+10,-7,+8,-21,+7,-13,+10,+13,-18,-6,+12,+1,-4,-5,+15,-25,-1,-2,+6,-2,+3,+27,-22,-4,-62,+8,+12,-29,+21,-19,-44,-13,+12,-68,+2,+12,+1,-17,-5,-16,-11,-14,+5,-8,-8,+12,-9,-1,-11,-14,+6,+13,-12,+14,+15,-18,+10,-4,-4,+18,+7,+17,+4,-13,+11,+9,-2,-6,-13,+2,+15,-13,-19,-8,+13,+1,-2,+10,-2,-19,-3,-14,-17,+14,-18,+19,-10,-15,-2,+6,-1,+16,-18,-5,-11,+4,+13,-7,-15,-11,-14,+6,+17,+3,-7,-16,-2,-7,-7,-1,+18,+20,+13,-10,-19,-10,+12,+7,-15,+7,+6,+3,+13,+1,-4,+11,-17,-9,-20,-12,-15,+10,-1,-5,-12,-15,+18,-16,+19,-17,-10,+18,+2,+14,-2,-21,-16,-4,-4,-3,+2,-9,+1,+5,-19,+10,+6,+8,-7,-12,-9,+11,+18,+18,-5,-20,+19,-7,+10,-5,-7,-17,-5,-4,-3,-5,+21,+18,+8,-9,-6,+3,-8,-17,-15,+19,-5,-8,-2,-1,+20,-38,+5,+12,-34,-17,-16,+18,-10,+7,+17,-18,+7,-16,+7,+10,-33,+6,-27,+1,+6,-4,-4,-5,-2,-9,-5,-1,+18,-6,-19,-18,-14,-29,-64,-25,-16,-11,-3,-11,-11,-23,+17,-4,-18,+3,-4,-14,+12,+18,-5,+73044")
            .mapToInt { it.toInt() }
            .sum()
    )
}
