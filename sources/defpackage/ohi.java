package defpackage;

import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class ohi extends mdh implements cf7 {
    public Object e;
    public int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ UploadFileAttachWorker h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohi(int i, UploadFileAttachWorker uploadFileAttachWorker, String str, lq4 lq4Var) {
        super(1, lq4Var);
        this.g = i;
        this.h = uploadFileAttachWorker;
        this.i = str;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new ohi(this.g, this.h, this.i, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((ohi) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        xji xjiVar;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            String str = this.i;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "UploadFileAttachWorker", qv1.k("No new upload started in 15000ms, failing upload ", str), null);
                }
            }
            xji xjiVar2 = new xji(this.g);
            UploadFileAttachWorker uploadFileAttachWorker = this.h;
            this.e = xjiVar2;
            this.f = 1;
            if (uploadFileAttachWorker.u(xjiVar2, this) == hu4Var) {
                return hu4Var;
            }
            xjiVar = xjiVar2;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xjiVar = (xji) this.e;
            ch3.d0(obj);
        }
        qrc.m(this.h.r(), lii.UPLOAD_UNKNOWN_ERROR, this.i, xjiVar.getMessage(), 20);
        return sbi.a;
    }
}
