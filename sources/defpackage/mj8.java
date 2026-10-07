package defpackage;

import one.me.devmenu.logsviewer.IntegrityLogsViewerScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mj8 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntegrityLogsViewerScreen b;

    public /* synthetic */ mj8(IntegrityLogsViewerScreen integrityLogsViewerScreen, int i) {
        this.a = i;
        this.b = integrityLogsViewerScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        IntegrityLogsViewerScreen integrityLogsViewerScreen = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                int i2 = IntegrityLogsViewerScreen.f;
                if (r5h.L0(str, "ACSP", false) && !r5h.L0(str, "Digesting data with size", false)) {
                    yab.i0(integrityLogsViewerScreen.getLifecycleScope(), null, 0, new el6(integrityLogsViewerScreen, str, null, 14), 3);
                }
                break;
            default:
                int i3 = IntegrityLogsViewerScreen.f;
                ltb onBackPressedDispatcher = integrityLogsViewerScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                break;
        }
        return sbiVar;
    }
}
