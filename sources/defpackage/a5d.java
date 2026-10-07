package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.nano.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a5d implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ a5d(int i) {
        this.a = i;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                zv8[] zv8VarArr = e5d.S6;
                return "Досрочный вывод из режима ожидания подключения";
            case 1:
                zv8[] zv8VarArr2 = e5d.S6;
                return "Прозрачное аудио";
            case 2:
                zv8[] zv8VarArr3 = e5d.S6;
                return "Отключить исправление логики фиксации данных о входящем видео";
            case 3:
                zv8[] zv8VarArr4 = e5d.S6;
                return "Включить поддержку и приоритизировать H265";
            case 4:
                zv8[] zv8VarArr5 = e5d.S6;
                return "Включение историй в профиле";
            case 5:
                return rki.c(R.drawable.blocked_ghost_avatar);
            case 6:
                return new LinkedHashSet();
            case 7:
                return ConcurrentHashMap.newKeySet();
            case 8:
                return new ConcurrentHashMap();
            case 9:
                return sbi.a;
            case 10:
                gue gueVar = (gue) d7c.a.getAccessor().d(68).getValue();
                gueVar.getClass();
                gm0.n("gue", "registerSelf");
                gueVar.a.a.add(gueVar);
                if (cqk.d(Looper.myLooper(), Looper.getMainLooper())) {
                    qid.i.f.a(gueVar.j);
                } else {
                    new Handler(Looper.getMainLooper()).post(new hed(5, gueVar));
                }
                return sbi.a;
            case 11:
                byte[] bArr = a.a;
                cqk.c = new nhb(22);
                return sbi.a;
            case 12:
                return p90.a(Boolean.TRUE);
            case 13:
                return sb8.i;
            case 14:
                return new ConcurrentHashMap();
            case 15:
                ifh ifhVar = d0g.a;
                return null;
            case 16:
                return sb8.a(qs8.d, new chf(11));
            case 17:
                Paint paint = new Paint(2);
                paint.setAntiAlias(true);
                return paint;
            case 18:
                r7 r7Var = r7.a;
                return new qzb(r7.d(ha9.b));
            case 19:
                qig.g.getClass();
                return (u9c) ((qzb) qig.h.getValue()).getAccessor().d(92).getValue();
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                qig.g.getClass();
                return (cjg) ((qzb) qig.h.getValue()).getAccessor().d(80).getValue();
            case 21:
                qig.g.getClass();
                return (Context) ((qzb) qig.h.getValue()).getAccessor().d(7).getValue();
            case 22:
                qig.g.getClass();
                Object systemService = ((Context) qig.k.getValue()).getSystemService((Class<Object>) ActivityManager.class);
                if (systemService != null) {
                    return (ActivityManager) systemService;
                }
                ore.p("Required value was null.");
                return null;
            case 23:
                qig.g.getClass();
                return (dd6) ((qzb) qig.h.getValue()).getAccessor().c(1122);
            case 24:
                return new Exception();
            case 25:
                return lmc.h;
            case 26:
                return new Rect();
            case 27:
                return new px8();
            case 28:
                return "thumbhash".getBytes(pt2.a);
            default:
                return new LruCache(200);
        }
    }
}
