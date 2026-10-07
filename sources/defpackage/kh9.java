package defpackage;

import one.me.devmenu.logsviewer.LogsViewerScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kh9 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LogsViewerScreen b;

    public /* synthetic */ kh9(LogsViewerScreen logsViewerScreen, int i) {
        this.a = i;
        this.b = logsViewerScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        LogsViewerScreen logsViewerScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = LogsViewerScreen.g;
                rcc rccVar = new rcc(logsViewerScreen.getContext());
                rccVar.setId(LogsViewerScreen.h);
                rccVar.setTitle("Логи");
                rccVar.setForm(gcc.Compact);
                rccVar.setLeftActions(new wbc(new lh9(0, logsViewerScreen)));
                return rccVar;
            default:
                zv8[] zv8VarArr2 = LogsViewerScreen.g;
                h hVar = logsViewerScreen.c;
                return new ai9((a4c) hVar.getAccessor().c(739), (xhh) hVar.getAccessor().c(23));
        }
    }
}
