package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class tsj implements usj {
    public final ctf a;
    public final i65 b;
    public final long c;
    public final int d;

    public tsj(ctf ctfVar, i65 i65Var, long j, int i) {
        this.a = ctfVar;
        this.b = i65Var;
        this.c = j;
        this.d = i;
    }

    @Override // defpackage.usj
    public final int a() {
        return this.d;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.c;
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.webapp_root_settings_transition;
    }
}
