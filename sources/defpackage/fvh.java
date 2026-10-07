package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class fvh extends o4m {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public fvh(gg1 gg1Var) {
        this.a = 1;
        this.d = gg1Var;
        this.b = false;
        this.c = 0;
    }

    @Override // defpackage.o4m, defpackage.e9j
    public void a() {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
        }
    }

    @Override // defpackage.o4m, defpackage.e9j
    public final void b() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((gvh) obj).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    e9j e9jVar = (e9j) ((gg1) obj).e;
                    if (e9jVar != null) {
                        e9jVar.b();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.e9j
    public final void c() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((gvh) obj).a.setVisibility(this.c);
                }
                break;
            default:
                int i2 = this.c + 1;
                this.c = i2;
                gg1 gg1Var = (gg1) obj;
                if (i2 == ((ArrayList) gg1Var.c).size()) {
                    e9j e9jVar = (e9j) gg1Var.e;
                    if (e9jVar != null) {
                        e9jVar.c();
                    }
                    this.c = 0;
                    this.b = false;
                    gg1Var.a = false;
                }
                break;
        }
    }

    public fvh(gvh gvhVar, int i) {
        this.a = 0;
        this.d = gvhVar;
        this.c = i;
        this.b = false;
    }
}
