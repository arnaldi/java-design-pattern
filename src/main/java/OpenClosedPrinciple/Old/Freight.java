package OpenClosedPrinciple.Old;

public class Freight implements OpenClosedPrinciple.FreightService {
    @Override
    public double calculatesFreight(String geoRegion) {

        if("SAO PAULO".equals(geoRegion.toUpperCase())) {
            return 7.5;
        }else if("MINAS GERAIS".equals(geoRegion.toUpperCase())){
            return 12.5;
        }else if("RIO DE JANEIRO".equals(geoRegion.toUpperCase())) {
            return 10.5;
        }else {
            return 10.0;
        }
    }
}
