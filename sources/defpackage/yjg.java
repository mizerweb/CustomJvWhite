package defpackage;

import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import kotlinx.coroutines.test.internal.TestMainDispatcherFactory;
import one.me.sdk.arch.Widget;
import one.video.player.BaseVideoPlayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yjg implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yjg(qk9 qk9Var, ArrayList arrayList, TestMainDispatcherFactory testMainDispatcherFactory) {
        this.a = 2;
        this.b = qk9Var;
        this.c = arrayList;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        Object poeVar;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ivb ivbVar = (ivb) obj2;
                aec aecVar = (aec) obj;
                aec aecVar2 = ivbVar.b;
                return "StatisticListener player setter: " + aecVar2 + " [" + (aecVar2 != null ? Integer.valueOf(((BaseVideoPlayer) aecVar2).a) : null) + "] -> " + aecVar + " [" + (aecVar != null ? Integer.valueOf(((BaseVideoPlayer) aecVar).a) : null) + "] " + qv1.l("statInfo: ", ivbVar.c != null ? "YES" : "NO", " nextStatInfo: ", ivbVar.d != null ? "YES" : "NO");
            case 1:
                return ((yre) obj2).invoke((WorkDatabase) obj);
            case 2:
                try {
                    lk9 lk9VarA = ((qk9) obj2).a((ArrayList) obj);
                    if (!(lk9VarA.S0() instanceof c0b)) {
                        return lk9VarA;
                    }
                    try {
                        lk9VarA.D0(lk9VarA, new ce5());
                        poeVar = sbi.a;
                        break;
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    kwl.b(roe.a(poeVar));
                    throw null;
                } catch (Throwable th2) {
                    kwl.b(th2);
                    throw null;
                }
            default:
                return Widget.scopeId_delegate$lambda$0((Bundle) obj2, (Widget) obj);
        }
    }

    public /* synthetic */ yjg(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
