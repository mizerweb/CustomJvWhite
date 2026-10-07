package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fhb implements fri {
    @Override // defpackage.fri
    public final tnh a(int i, String str) {
        if (str.length() <= 0) {
            return null;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '-' && cCharAt != ' ') {
                return null;
            }
        }
        Integer numA = z2m.a(i, zfe.a(fhb.class));
        if (numA != null) {
            return new tnh(numA.intValue());
        }
        return null;
    }
}
