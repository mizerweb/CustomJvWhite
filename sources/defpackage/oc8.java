package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.ToLongFunction;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class oc8 implements hh9 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ifh d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final l7f i;
    public vz8 k = null;
    public final ConcurrentHashMap j = new ConcurrentHashMap();

    public oc8(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ifh ifhVar, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, l7f l7fVar) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ifhVar;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = ny8Var7;
        this.i = l7fVar;
    }

    public final Map a(long j) {
        return (Map) this.j.get(Long.valueOf(j));
    }

    public final List b(long j) {
        List arrayList;
        Map mapA = a(j);
        if (mapA == null || mapA.isEmpty()) {
            gm0.n("oc8", "getNotifList: there is no notifs for chat, chatId = " + j);
            return null;
        }
        try {
            arrayList = new ArrayList(mapA.entrySet());
        } catch (NoSuchElementException unused) {
            arrayList = Collections.EMPTY_LIST;
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.size() > 1) {
                arrayList.sort(Comparator.comparingLong(new ToLongFunction() { // from class: nc8
                    @Override // java.util.function.ToLongFunction
                    public final long applyAsLong(Object obj) {
                        return ((nib) ((Map.Entry) obj).getValue()).a;
                    }
                }));
            }
            return arrayList;
        }
        gm0.n("oc8", "getNotifList: there is no notifs for chat, chatId = " + j);
        return null;
    }

    @Override // defpackage.hh9
    public final void c() {
        this.j.clear();
    }

    public final void d(long j) {
        gm0.n("oc8", "postEvent: chat.id =  " + j);
        f(j);
        vz8 vz8Var = this.k;
        if (vz8Var != null) {
            yab.i0(vz8Var.e, null, 0, new uz8(vz8Var, j, null), 3);
        }
    }

    public final synchronized void e(long j, long j2) {
        try {
            gm0.n("oc8", "removeTyping: chatId = " + j + ", sender = " + j2);
            Map mapA = a(j);
            if (mapA != null) {
                mapA.remove(Long.valueOf(j2));
                if (mapA.isEmpty()) {
                    gm0.n("oc8", "removeTyping: remove chat notifs, chatId = " + j);
                    this.j.remove(Long.valueOf(j));
                }
                d(j);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String f(long j) {
        List listB = b(j);
        if (listB == null) {
            gm0.n("oc8", "typingText: there is no notifs for chat, chatId = " + j);
            return null;
        }
        rt2 rt2VarN = ((qw2) this.f.getValue()).N(j);
        if (rt2VarN == null) {
            ((t1c) ((ed6) this.b.getValue())).a(new IllegalStateException("chat is null"));
            return "";
        }
        boolean zH0 = rt2VarN.h0();
        nib nibVar = (nib) ((Map.Entry) listB.get(0)).getValue();
        long jLongValue = ((Long) ((Map.Entry) listB.get(0)).getKey()).longValue();
        if (zH0) {
            p4c p4cVar = (p4c) this.c.getValue();
            p4cVar.getClass();
            w50 w50Var = nibVar.b;
            if (w50Var == null) {
                return p4cVar.a.getString(R.string.tt_typing);
            }
            int iOrdinal = w50Var.ordinal();
            if (iOrdinal == 2) {
                return p4cVar.a.getString(R.string.tt_typing_photo);
            }
            if (iOrdinal == 3) {
                return p4cVar.a.getString(R.string.tt_typing_video);
            }
            Context context = p4cVar.a;
            if (iOrdinal == 4) {
                return context.getString(R.string.tt_typing_audio);
            }
            if (iOrdinal == 5) {
                return context.getString(R.string.tt_typing_sticker);
            }
            if (iOrdinal != 9) {
                return iOrdinal != 15 ? context.getString(R.string.tt_typing) : context.getString(R.string.tt_typing_video_message);
            }
            return context.getString(R.string.tt_typing_file);
        }
        StringBuilder sb = new StringBuilder();
        int size = listB.size();
        ny8 ny8Var = this.g;
        if (size == 1) {
            vg4 vg4VarF = ((bi4) ny8Var.getValue()).f(jLongValue, false);
            if (vg4VarF == null || vg4VarF.I()) {
                return null;
            }
            sb.append(vg4VarF.k());
        } else if (listB.size() == 2) {
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                vg4 vg4VarF2 = ((bi4) ny8Var.getValue()).f(((Long) ((Map.Entry) it.next()).getKey()).longValue(), false);
                if (vg4VarF2 != null && !vg4VarF2.I()) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append(vg4VarF2.k());
                }
            }
        } else {
            sb.append(woh.q(R.plurals.tt_chat_subtitle_count, listB.size(), (Context) this.a.getValue()));
        }
        return sb.toString();
    }
}
