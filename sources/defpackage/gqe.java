package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gqe implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ File b;

    public /* synthetic */ gqe(File file, int i) {
        this.a = i;
        this.b = file;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        Object poeVar;
        Object poeVar2;
        int i = this.a;
        File file = this.b;
        switch (i) {
            case 0:
                try {
                    poeVar2 = Boolean.valueOf(file.exists() ? file.delete() : false);
                    break;
                } catch (Throwable th) {
                    poeVar2 = new poe(th);
                }
                Object obj = Boolean.FALSE;
                if (poeVar2 instanceof poe) {
                    poeVar2 = obj;
                }
                return sbi.a;
            default:
                try {
                    poeVar = Boolean.valueOf(file.exists() ? file.delete() : false);
                    break;
                } catch (Throwable th2) {
                    poeVar = new poe(th2);
                }
                Object obj2 = Boolean.FALSE;
                if (poeVar instanceof poe) {
                    poeVar = obj2;
                }
                return (Boolean) poeVar;
        }
    }
}
