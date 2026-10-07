package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pg6 {
    public final hyh a;
    public final int[] b;

    public pg6(hyh hyhVar, int... iArr) {
        if (iArr.length == 0) {
            lvb.l0("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = hyhVar;
        this.b = iArr;
    }
}
