package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class vtg extends s7g {
    public final to3 u;
    public osg v;

    public vtg(to3 to3Var, Context context) {
        super(new esg(context));
        this.u = to3Var;
    }

    public static final void H(vtg vtgVar, esg esgVar, boolean z) {
        if (!z) {
            esgVar.setStoryAddListener(null);
            return;
        }
        esgVar.setStoryAddListener(new fl9(0, vtgVar.u, to3.class, "onAddStoryClick", "onAddStoryClick()V", 0, 7));
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        osg osgVar = (osg) k79Var;
        this.v = osgVar;
        esg esgVar = (esg) this.a;
        esgVar.setModel(osgVar);
        H(this, esgVar, osgVar.g == msg.a);
        qe7.H(esgVar, 300L, new ttg(this));
        if (!osgVar.a) {
            esgVar.setOnLongClickListener(new utg(this));
        } else {
            esgVar.setOnLongClickListener(null);
            esgVar.setLongClickable(false);
        }
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void C(osg osgVar, Object obj) {
        msg msgVar = osgVar.g;
        this.v = osgVar;
        nsg nsgVar = obj instanceof nsg ? (nsg) obj : null;
        if (nsgVar == null) {
            return;
        }
        esg esgVar = (esg) this.a;
        if (nsgVar.q()) {
            esgVar.a.z(osgVar.e, osgVar.f);
        }
        boolean zO = nsgVar.o();
        msg msgVar2 = msg.a;
        if (zO) {
            esgVar.setIconState(msgVar);
            H(this, esgVar, msgVar == msgVar2);
        }
        if (nsgVar.p()) {
            esgVar.setPublishProgress(osgVar.h);
            H(this, esgVar, msgVar == msgVar2);
        }
    }
}
