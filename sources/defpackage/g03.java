package defpackage;

import one.video.transloader.task.UploadTask;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g03 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g03(int i, long j, long j2, Object obj) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        long j = this.c;
        sbi sbiVar = sbi.a;
        long j2 = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                qw2 qw2Var = (qw2) obj;
                ox2 ox2VarL = qw2Var.L(j2);
                if (ox2VarL != null) {
                    qw2Var.f0(ox2VarL.a, ox2VarL.b, this.c);
                }
                break;
            case 1:
                qw2 qw2VarJ = ((xn3) obj).j();
                qw2VarJ.getClass();
                gm0.m("qw2", "changeLastNotifMessageId, chatId = %d, lastNotifMessageId = %d", Long.valueOf(j2), Long.valueOf(j));
                qw2VarJ.v(j2, false, new x50(j, 10));
                break;
            default:
                ((UploadTask) obj).d(new gji(j2, j));
                break;
        }
        return sbiVar;
    }
}
