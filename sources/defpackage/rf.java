package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rf implements fri {
    public final lge a = new lge("^[a-zA-ZА-я\\u0401\\u0451\\u00eb\\u00cb\\- ]+$");

    @Override // defpackage.fri
    public final tnh a(int i, String str) {
        Integer numA;
        if (str.length() <= 0 || this.a.b(str) || (numA = z2m.a(i, zfe.a(rf.class))) == null) {
            return null;
        }
        return new tnh(numA.intValue());
    }
}
