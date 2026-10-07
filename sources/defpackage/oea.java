package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oea implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ata b;
    public final /* synthetic */ tea c;

    public /* synthetic */ oea(tea teaVar, ata ataVar) {
        this.a = 0;
        this.c = teaVar;
        this.b = ataVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        tea teaVar = this.c;
        ata ataVar = this.b;
        switch (i) {
            case 0:
                teaVar.P(ataVar, null);
                break;
            case 1:
                ataVar.b(teaVar.A);
                break;
            default:
                ataVar.b(teaVar.A);
                break;
        }
    }

    public /* synthetic */ oea(ata ataVar, tea teaVar, int i) {
        this.a = i;
        this.b = ataVar;
        this.c = teaVar;
    }
}
