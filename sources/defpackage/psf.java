package defpackage;

import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public interface psf extends k79 {
    public static final bsf N0 = bsf.a;

    int A();

    esf b();

    ynh c();

    msf d();

    dz8 e();

    ynh f();

    ynh getTitle();

    default osf getType() {
        return osf.b;
    }

    @Override // defpackage.k79
    default boolean h(k79 k79Var) {
        return getItemId() == k79Var.getItemId();
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    default int getF() {
        return 0;
    }

    @Override // defpackage.k79
    default Object n(k79 k79Var) {
        ctf ctfVar = k79Var instanceof ctf ? (ctf) k79Var : null;
        if (ctfVar == null) {
            return null;
        }
        nsf nsfVar = new nsf(3);
        BitSet bitSet = (BitSet) nsfVar.b;
        bitSet.set(0, A() != ctfVar.b);
        bitSet.set(1, (cqk.d(getTitle(), ctfVar.c) && cqk.d(v(), ctfVar.d)) ? false : true);
        bitSet.set(8, t() != ctfVar.j);
        bitSet.set(2, getType() != ctfVar.e);
        bitSet.set(3, !cqk.d(f(), ctfVar.f));
        bitSet.set(4, !cqk.d(d(), ctfVar.h));
        bitSet.set(5, !cqk.d(b(), ctfVar.i));
        bitSet.set(6, !cqk.d(c(), ctfVar.k));
        bitSet.set(7, !cqk.d(e(), ctfVar.g));
        return nsfVar;
    }

    default boolean t() {
        return false;
    }

    default ynh v() {
        return ynh.b;
    }
}
