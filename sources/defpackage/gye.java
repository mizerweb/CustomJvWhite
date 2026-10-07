package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class gye extends hye implements Iterator {
    public eye a;
    public eye b;

    public gye(eye eyeVar, eye eyeVar2) {
        this.a = eyeVar2;
        this.b = eyeVar;
    }

    @Override // defpackage.hye
    public final void a(eye eyeVar) {
        eye eyeVarC = null;
        if (this.a == eyeVar && eyeVar == this.b) {
            this.b = null;
            this.a = null;
        }
        eye eyeVar2 = this.a;
        if (eyeVar2 == eyeVar) {
            this.a = b(eyeVar2);
        }
        eye eyeVar3 = this.b;
        if (eyeVar3 == eyeVar) {
            eye eyeVar4 = this.a;
            if (eyeVar3 != eyeVar4 && eyeVar4 != null) {
                eyeVarC = c(eyeVar3);
            }
            this.b = eyeVarC;
        }
    }

    public abstract eye b(eye eyeVar);

    public abstract eye c(eye eyeVar);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        eye eyeVar = this.b;
        eye eyeVar2 = this.a;
        this.b = (eyeVar == eyeVar2 || eyeVar2 == null) ? null : c(eyeVar);
        return eyeVar;
    }
}
