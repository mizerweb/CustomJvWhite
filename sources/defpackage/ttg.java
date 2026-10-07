package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ttg implements View.OnClickListener {
    public final /* synthetic */ vtg a;

    public ttg(vtg vtgVar) {
        this.a = vtgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        vtg vtgVar = this.a;
        to3 to3Var = vtgVar.u;
        osg osgVar = vtgVar.v;
        if (osgVar == null) {
            return;
        }
        long j = osgVar.i;
        if (osgVar.g == msg.b) {
            to3Var.b(j);
        } else if (osgVar.j) {
            to3Var.a();
        } else {
            to3Var.b(j);
        }
    }
}
