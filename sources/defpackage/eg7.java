package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class eg7 extends l72 implements dg7, tv8 {
    private final int arity;

    public eg7(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // defpackage.l72
    public qv8 computeReflected() {
        zfe.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eg7) {
            eg7 eg7Var = (eg7) obj;
            return getName().equals(eg7Var.getName()) && getSignature().equals(eg7Var.getSignature()) && cqk.d(getBoundReceiver(), eg7Var.getBoundReceiver()) && cqk.d(getOwner(), eg7Var.getOwner());
        }
        if (obj instanceof tv8) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.dg7
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.l72
    public tv8 getReflected() {
        qv8 qv8VarCompute = compute();
        if (qv8VarCompute != this) {
            return (tv8) qv8VarCompute;
        }
        throw new lu4();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.tv8
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.tv8
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.tv8
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.tv8
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.tv8
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        qv8 qv8VarCompute = compute();
        if (qv8VarCompute != this) {
            return qv8VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
