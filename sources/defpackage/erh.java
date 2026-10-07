package defpackage;

import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class erh implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThreadsStateViewerScreen b;

    public /* synthetic */ erh(ThreadsStateViewerScreen threadsStateViewerScreen, int i) {
        this.a = i;
        this.b = threadsStateViewerScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        final ThreadsStateViewerScreen threadsStateViewerScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = ThreadsStateViewerScreen.f;
                rcc rccVar = new rcc(threadsStateViewerScreen.getContext());
                rccVar.setId(R.id.threads_state_toolbar);
                rccVar.setTitle("Состояние потоков");
                rccVar.setForm(gcc.Compact);
                final int i2 = 0;
                rccVar.setLeftActions(new wbc(new cf7() { // from class: frh
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) {
                        int i3 = i2;
                        sbi sbiVar = sbi.a;
                        ThreadsStateViewerScreen threadsStateViewerScreen2 = threadsStateViewerScreen;
                        zv8[] zv8VarArr2 = ThreadsStateViewerScreen.f;
                        switch (i3) {
                            case 0:
                                ltb onBackPressedDispatcher = threadsStateViewerScreen2.getOnBackPressedDispatcher();
                                if (onBackPressedDispatcher != null) {
                                    onBackPressedDispatcher.d();
                                }
                                break;
                            default:
                                drh drhVar = (drh) threadsStateViewerScreen2.d.getValue();
                                drhVar.getClass();
                                drhVar.e.B(drhVar, drh.g[0], a8j.t(drhVar, null, new hpf(drhVar, null, 12), 1));
                                break;
                        }
                        return sbiVar;
                    }
                }));
                final int i3 = 1;
                rccVar.setRightActions(new acc(null, new jcc(R.drawable.icon_redo, null, null, null, 0.0f, new cf7() { // from class: frh
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) {
                        int i4 = i3;
                        sbi sbiVar = sbi.a;
                        ThreadsStateViewerScreen threadsStateViewerScreen2 = threadsStateViewerScreen;
                        zv8[] zv8VarArr2 = ThreadsStateViewerScreen.f;
                        switch (i4) {
                            case 0:
                                ltb onBackPressedDispatcher = threadsStateViewerScreen2.getOnBackPressedDispatcher();
                                if (onBackPressedDispatcher != null) {
                                    onBackPressedDispatcher.d();
                                }
                                break;
                            default:
                                drh drhVar = (drh) threadsStateViewerScreen2.d.getValue();
                                drhVar.getClass();
                                drhVar.e.B(drhVar, drh.g[0], a8j.t(drhVar, null, new hpf(drhVar, null, 12), 1));
                                break;
                        }
                        return sbiVar;
                    }
                }, 238), null));
                return rccVar;
            default:
                zv8[] zv8VarArr2 = ThreadsStateViewerScreen.f;
                return new drh(threadsStateViewerScreen.b);
        }
    }
}
