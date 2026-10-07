package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eli {
    public final cf7 a;
    public final iq7 b;
    public final nmf c;
    public final ny8 d;

    public eli(cf7 cf7Var, iq7 iq7Var, nmf nmfVar, ny8 ny8Var) {
        this.a = cf7Var;
        this.b = iq7Var;
        this.c = nmfVar;
        this.d = ny8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!eli.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        eli eliVar = (eli) obj;
        return this.c == eliVar.c && this.b == eliVar.b;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.c.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "UseCaseCameraConfig(cameraGraphFactory=" + this.a + ", graphStateToCameraStateAdapter=" + this.b + ", sessionConfigAdapter=" + this.c + ", sessionProcessor=null, lazyCreationResult=" + this.d + ')';
    }
}
