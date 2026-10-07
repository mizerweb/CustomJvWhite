package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sn9 extends b2 {
    public final /* synthetic */ tn9 a;

    public sn9(tn9 tn9Var) {
        this.a = tn9Var;
    }

    @Override // defpackage.b2, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = this.a.a.group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // defpackage.b2
    public final int getSize() {
        return this.a.a.groupCount() + 1;
    }

    @Override // defpackage.b2, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // defpackage.b2, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
