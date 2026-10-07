package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class urc extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ vrc f;
    public final /* synthetic */ File g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ urc(vrc vrcVar, File file, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = vrcVar;
        this.g = file;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        File file = this.g;
        vrc vrcVar = this.f;
        switch (i) {
            case 0:
                return new urc(vrcVar, file, lq4Var, 0);
            default:
                return new urc(vrcVar, file, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((urc) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        File file = this.g;
        vrc vrcVar = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                h8c h8cVar = (h8c) vrcVar.e.getValue();
                h8cVar.n("Дамп трейса готов");
                h8cVar.b(file.getAbsolutePath());
                return h8cVar.p();
            default:
                ch3.d0(obj);
                h8c h8cVar2 = (h8c) vrcVar.e.getValue();
                h8cVar2.n("Дамп сохранён, но не удалось поделиться файлом");
                h8cVar2.b(file.getAbsolutePath());
                return h8cVar2.p();
        }
    }
}
