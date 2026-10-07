package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fye extends hye implements Iterator {
    public eye a;
    public boolean b = true;
    public final /* synthetic */ iye c;

    public fye(iye iyeVar) {
        this.c = iyeVar;
    }

    @Override // defpackage.hye
    public final void a(eye eyeVar) {
        eye eyeVar2 = this.a;
        if (eyeVar == eyeVar2) {
            eye eyeVar3 = eyeVar2.d;
            this.a = eyeVar3;
            this.b = eyeVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        eye eyeVar = this.a;
        return (eyeVar == null || eyeVar.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            this.a = this.c.a;
        } else {
            eye eyeVar = this.a;
            this.a = eyeVar != null ? eyeVar.c : null;
        }
        return this.a;
    }
}
