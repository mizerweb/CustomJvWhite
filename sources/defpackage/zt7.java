package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class zt7 extends tw3 {
    public final /* synthetic */ int b;
    public final l79 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt7(aw8 aw8Var, int i) {
        super(aw8Var);
        this.b = i;
        switch (i) {
            case 1:
                super(aw8Var);
                this.c = new yv(aw8Var.d(), 2);
                break;
            default:
                this.c = new yv(aw8Var.d(), 1);
                break;
        }
    }

    @Override // defpackage.aw8
    public final fif d() {
        switch (this.b) {
            case 0:
                break;
        }
        return (yv) this.c;
    }

    @Override // defpackage.k0
    public final Object e() {
        switch (this.b) {
            case 0:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // defpackage.k0
    public final int f(Object obj) {
        switch (this.b) {
            case 0:
                return ((HashSet) obj).size();
            default:
                return ((LinkedHashSet) obj).size();
        }
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        switch (this.b) {
            case 0:
                return new HashSet((Collection) null);
            default:
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // defpackage.k0
    public final Object l(Object obj) {
        switch (this.b) {
            case 0:
                return (HashSet) obj;
            default:
                return (LinkedHashSet) obj;
        }
    }

    @Override // defpackage.sw3
    public final void m(Object obj, int i, Object obj2) {
        switch (this.b) {
            case 0:
                ((HashSet) obj).add(obj2);
                break;
            default:
                ((LinkedHashSet) obj).add(obj2);
                break;
        }
    }
}
