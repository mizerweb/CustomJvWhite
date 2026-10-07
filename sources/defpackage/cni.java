package defpackage;

import one.me.folders.list.FoldersListScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class cni extends s7g implements sn8 {
    public ks9 u;

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        zmi zmiVar = (zmi) k79Var;
        bni bniVar = (bni) this.a;
        bniVar.setType(zmiVar.b);
        CharSequence charSequenceA = zmiVar.c.a(this);
        if (charSequenceA == null) {
            charSequenceA = "";
        }
        bniVar.setTitle(charSequenceA);
    }

    @Override // defpackage.s7g
    public final void G() {
        this.u = null;
    }

    @Override // defpackage.sn8
    public final void d() {
        ((bni) this.a).animate().translationZ(0.0f);
        ks9 ks9Var = this.u;
        if (ks9Var != null) {
            k57 k57VarO1 = ((FoldersListScreen) ks9Var.b).o1();
            int iK = k() - 1;
            String str = k57VarO1.m;
            if (str == null || str.length() == 0) {
                gm0.Y(k57.class.getName(), "Early return in onStopDrag cuz of movedFolderId.isNullOrEmpty()");
                return;
            }
            k57VarO1.q.B(k57VarO1, k57.r[2], yab.h0(k57VarO1.b, ((n0c) k57VarO1.d).c().S0(), 2, new je0(k57VarO1, str, iK, (lq4) null, 3)));
            k57VarO1.m = null;
        }
    }

    @Override // defpackage.sn8
    public final void e() {
        ((bni) this.a).animate().translationZ(yl5.d().getDisplayMetrics().density * 20.0f);
    }
}
