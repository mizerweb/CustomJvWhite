package defpackage;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.text.TextPaint;
import java.lang.annotation.Annotation;
import java.util.concurrent.CopyOnWriteArraySet;
import one.me.android.initialization.a;
import one.me.chats.tab.ChatsTabWidget;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import one.video.player.BaseVideoPlayer;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b6 implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ b6(int i) {
        this.a = i;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        Object poeVar;
        Object poeVar2;
        Object poeVar3;
        switch (this.a) {
            case 0:
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "Concurrency", zo5.h(((Number) m94.c.getValue()).intValue(), "ioPoolSize="), null);
                    }
                }
                return sbi.a;
            case 1:
                yab.m0("native-filters");
                return sbi.a;
            case 2:
                od6 od6Var = m94.a;
                tre.m = lhb.e;
                tre.n = nhb.e;
                tre.o = gp0.f;
                tre.l = a.a;
                return sbi.a;
            case 3:
                bu buVar = bu.a;
                return Boolean.TRUE;
            case 4:
                bu buVar2 = bu.a;
                return Boolean.FALSE;
            case 5:
                try {
                    poeVar = swh.a;
                    if (swh.b) {
                        poeVar = null;
                    }
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                return (swh) (poeVar instanceof poe ? null : poeVar);
            case 6:
                bu buVar3 = bu.a;
                try {
                    poeVar2 = ((swh) bu.g.getValue()) != null ? xwh.a : null;
                    break;
                } catch (Throwable th2) {
                    poeVar2 = new poe(th2);
                }
                return (xwh) (poeVar2 instanceof poe ? null : poeVar2);
            case 7:
                return new b9b();
            case 8:
                return new Paint(1);
            case 9:
                af7 af7Var = nk0.a;
                return Boolean.FALSE;
            case 10:
                return new Path();
            case 11:
                return new na6("ru.ok.tamtam.models.pms.BackgroundWakeConfig.Disabled", sm0.INSTANCE, new Annotation[0]);
            case 12:
                return i4e.a;
            case 13:
                wx wxVar = BaseVideoPlayer.C;
                wje wjeVar = new wje();
                wjeVar.start();
                return wjeVar;
            case 14:
                wx wxVar2 = BaseVideoPlayer.C;
                return c0a.o("Player is not created on the main thread.\nCurrent thread: '", Thread.currentThread().getName(), "'");
            case 15:
                wx wxVar3 = BaseVideoPlayer.C;
                return new Exception();
            case 16:
                return new su0();
            case 17:
                return new hid();
            case 18:
                return new sbd(12);
            case 19:
                return new ColorDrawable(0);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new CopyOnWriteArraySet();
            case 21:
                return new CopyOnWriteArraySet();
            case 22:
                return new TextPaint();
            case 23:
                return vs0.b;
            case 24:
                return new FitFontImageSpan(new mc0(), kw6.a, false, false, 12, null);
            case 25:
                return new FitFontImageSpan(new r1j(), kw6.a, false, false, 12, null);
            case 26:
                zv8[] zv8VarArr = ChatsTabWidget.B1;
                return new int[2];
            case 27:
                return new StringBuilder();
            case 28:
                try {
                    Resources system = Resources.getSystem();
                    int identifier = system.getIdentifier("db_connection_pool_size", "integer", "android");
                    int integer = identifier != 0 ? system.getInteger(identifier) : -1;
                    if (integer <= 0) {
                        integer = 4;
                    }
                    poeVar3 = Integer.valueOf(integer);
                    break;
                } catch (Throwable th3) {
                    poeVar3 = new poe(th3);
                }
                if (poeVar3 instanceof poe) {
                    poeVar3 = 4;
                }
                int iIntValue = ((Number) poeVar3).intValue();
                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                if (iAvailableProcessors >= 4) {
                    iIntValue = iAvailableProcessors < 8 ? Math.min(8, iIntValue * 2) : Math.min(16, iIntValue * 4);
                }
                return Integer.valueOf(iIntValue);
            default:
                return new n0c(m94.i);
        }
    }
}
