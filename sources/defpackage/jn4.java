package defpackage;

import android.os.Bundle;
import one.me.contactlist.ContactListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jn4 implements t65, r89, mf7, rv9, qg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ jn4(int i, emf emfVar, Bundle bundle, Bundle bundle2) {
        this.a = 5;
        this.b = i;
    }

    @Override // defpackage.qg4
    public void accept(Object obj) {
        int i = this.a;
        int i2 = this.b;
        j4d j4dVar = (j4d) obj;
        switch (i) {
            case 7:
                j4dVar.P(i2);
                break;
            case 8:
                j4dVar.d0(i2);
                break;
            case 9:
                j4dVar.setRepeatMode(i2);
                break;
            default:
                j4dVar.n0(i2);
                break;
        }
    }

    @Override // defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 2:
                return Integer.valueOf(i2);
            case 3:
            default:
                return by3.i(i2, (Bundle) obj);
            case 4:
                return by3.i(i2, (Bundle) obj);
        }
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        int i = this.a;
        int i2 = this.b;
        j3d j3dVar = (j3d) obj;
        switch (i) {
            case 1:
                j3dVar.onRepeatModeChanged(i2);
                break;
            default:
                j3dVar.onRepeatModeChanged(i2);
                break;
        }
    }

    @Override // defpackage.rv9
    public void l(jv9 jv9Var) {
        if (jv9Var.isConnected() && jv9Var.l.get(this.b) != null) {
            ore.m();
        }
    }

    @Override // defpackage.t65
    public Object t() {
        return new ContactListWidget(cl4.a, new ha9(this.b));
    }

    public /* synthetic */ jn4(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
