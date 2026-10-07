package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a09 implements fri {
    public final int a;

    public a09(int i) {
        this.a = i;
    }

    @Override // defpackage.fri
    public final tnh a(int i, String str) {
        Integer numA;
        if (str.length() <= this.a || (numA = z2m.a(i, zfe.a(a09.class))) == null) {
            return null;
        }
        return new tnh(numA.intValue());
    }
}
