package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class fwd extends l72 implements zv8 {
    public final boolean a;

    public fwd(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.a = (i & 2) == 2;
    }

    @Override // defpackage.l72
    public final qv8 compute() {
        return this.a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fwd) {
            fwd fwdVar = (fwd) obj;
            return getOwner().equals(fwdVar.getOwner()) && getName().equals(fwdVar.getName()) && getSignature().equals(fwdVar.getSignature()) && cqk.d(getBoundReceiver(), fwdVar.getBoundReceiver());
        }
        if (obj instanceof zv8) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.l72
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final zv8 getReflected() {
        if (this.a) {
            c.i("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        qv8 qv8VarCompute = compute();
        if (qv8VarCompute != this) {
            return (zv8) qv8VarCompute;
        }
        throw new lu4();
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        qv8 qv8VarCompute = compute();
        if (qv8VarCompute != this) {
            return qv8VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
