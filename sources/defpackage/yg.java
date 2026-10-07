package defpackage;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class yg implements fih {
    public static final Address b = new Address(Locale.ROOT);
    public static final Map c = Collections.synchronizedMap(new yo9(100));
    public final ifh a;

    public yg(Context context, ifh ifhVar) {
        this.a = new ifh(new z2(context, 2, ifhVar));
    }

    public static String d(Address address, String str, Address address2) {
        if (address2 != null) {
            String locality = address.getLocality();
            if (!g(locality) && !cqk.d(locality, address2.getLocality())) {
                return zo5.p(locality, " ", str);
            }
        }
        return str;
    }

    public static String e(Address address, String str, Address address2) {
        if (address2 != null) {
            String countryName = address.getCountryName();
            if (!g(countryName) && !cqk.d(countryName, address2.getCountryName())) {
                return zo5.p(countryName, " ", str);
            }
        }
        return str;
    }

    public static boolean g(String str) {
        return ch3.r(str) || ch3.a(str, "Unnamed Road") || ch3.a(str, "Null");
    }

    @Override // defpackage.fih
    public final float a(double d, double d2, double d3, double d4) {
        return (float) uvl.a(d, d2, d3, d4);
    }

    @Override // defpackage.fih
    public final Object b(double d, double d2, double d3, double d4, nq4 nq4Var) {
        Address addressF = f(d, d2);
        if (addressF == null) {
            return "";
        }
        Address addressF2 = f(d3, d4);
        String thoroughfare = addressF.getThoroughfare();
        if (g(thoroughfare)) {
            thoroughfare = null;
        } else {
            String subThoroughfare = addressF.getSubThoroughfare();
            if (!g(subThoroughfare)) {
                thoroughfare = zo5.p(thoroughfare, " ", subThoroughfare);
            }
        }
        if (!g(thoroughfare)) {
            return woh.e(e(addressF, d(addressF, thoroughfare, addressF2), addressF2));
        }
        String featureName = addressF.getFeatureName();
        if (!g(featureName) && !featureName.matches("\\d+")) {
            return woh.e(e(addressF, d(addressF, featureName, addressF2), addressF2));
        }
        String locality = addressF.getLocality();
        if (!g(locality)) {
            return woh.e(e(addressF, locality, addressF2));
        }
        String adminArea = addressF.getAdminArea();
        if (!g(adminArea)) {
            return woh.e(e(addressF, adminArea, addressF2));
        }
        String countryName = addressF.getCountryName();
        if (!g(countryName)) {
            return woh.e(countryName);
        }
        String addressLine = addressF.getMaxAddressLineIndex() != -1 ? addressF.getAddressLine(0) : "";
        if (!g(addressLine)) {
            return addressLine;
        }
        String countryName2 = addressF.getCountryName();
        if (!ch3.r(countryName2)) {
            addressLine = countryName2;
        }
        String locality2 = addressF.getLocality();
        if (ch3.r(locality2)) {
            return addressLine;
        }
        return ch3.r(countryName2) ? locality2 : zo5.p(addressLine, ", ", locality2);
    }

    @Override // defpackage.fih
    public final boolean c(double d, double d2, double d3, double d4) {
        return ((float) uvl.a(d, d2, d3, d4)) < 10.0f;
    }

    public final Address f(double d, double d2) {
        double d3;
        double d4;
        if (d != 0.0d || d2 != 0.0d) {
            ylc ylcVar = new ylc(Double.valueOf(d), Double.valueOf(d2));
            Map map = c;
            Address address = (Address) map.get(ylcVar);
            Address address2 = b;
            if (address != address2) {
                if (address != null) {
                    return address;
                }
                try {
                    d3 = d;
                    d4 = d2;
                    try {
                        List<Address> fromLocation = ((Geocoder) this.a.getValue()).getFromLocation(d3, d4, 1);
                        List<Address> list = fromLocation;
                        if (list == null || list.isEmpty()) {
                            map.put(ylcVar, address2);
                            return null;
                        }
                        Address address3 = fromLocation.get(0);
                        map.put(ylcVar, address3);
                        return address3;
                    } catch (IOException unused) {
                        String str = String.format(Locale.ENGLISH, "Can't decode latitude = %s longitude = %s", Arrays.copyOf(new Object[]{Double.valueOf(d3), Double.valueOf(d4)}, 2));
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            a4c.f(a4cVar, je9.g, "yg", str, null, null, 8);
                        }
                        return null;
                    }
                } catch (IOException unused2) {
                    d3 = d;
                    d4 = d2;
                }
            }
        }
        return null;
    }
}
