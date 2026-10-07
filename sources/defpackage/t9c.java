package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import one.me.calls.impl.utils.ConnectionUnavailableException;
import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;

/* JADX INFO: loaded from: classes3.dex */
public final class t9c implements StartConversationDelegate {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public t9c(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object a(t9c t9cVar, StartConversationDelegate.Params params, nq4 nq4Var) {
        s9c s9cVar;
        Object success;
        iui iuiVar;
        if (nq4Var instanceof s9c) {
            s9cVar = (s9c) nq4Var;
            int i = s9cVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                s9cVar.g = i - Integer.MIN_VALUE;
            } else {
                s9cVar = new s9c(t9cVar, nq4Var);
            }
        } else {
            s9cVar = new s9c(t9cVar, nq4Var);
        }
        s9c s9cVar2 = s9cVar;
        Object poeVar = s9cVar2.e;
        int i2 = s9cVar2.g;
        String str = null;
        try {
            if (i2 == 0) {
                ch3.d0(poeVar);
                uyb uybVar = (uyb) t9cVar.a.getValue();
                String conversationId = params.getConversationId();
                List<String> calleeIds = params.getCalleeIds();
                ArrayList arrayList = new ArrayList(yw3.W0(calleeIds, 10));
                Iterator<T> it = calleeIds.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Long(Long.parseLong((String) it.next())));
                }
                long[] jArrU1 = ww3.U1(arrayList);
                Long chatId = params.getChatId();
                boolean zIsVideo = params.isVideo();
                String internalParams = params.getInternalParams();
                s9cVar2.d = params;
                s9cVar2.g = 1;
                poeVar = uybVar.d(conversationId, jArrU1, chatId, zIsVideo, internalParams, s9cVar2);
                hu4 hu4Var = hu4.a;
                if (poeVar == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                params = s9cVar2.d;
                ch3.d0(poeVar);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (!(poeVar instanceof poe)) {
            jui juiVar = (jui) poeVar;
            List list = juiVar.e;
            String conversationId2 = juiVar.c;
            if (list != null && (iuiVar = (iui) ww3.t1(list)) != null) {
                str = iuiVar.b;
            }
            String str2 = juiVar.d;
            if (((Number) ((e5d) t9cVar.d.getValue()).s1.a(e5d.S6[121]).i()).intValue() >= 0 && (juiVar.f & 1) != 0) {
                ((qd1) t9cVar.e.getValue()).a.add(conversationId2 == null ? params.getConversationId() : conversationId2);
            }
            if (str != null) {
                success = new StartConversationDelegate.Result.Error(str);
            } else if (str2 == null) {
                success = new StartConversationDelegate.Result.Error(new IllegalArgumentException("internalCallerParams must not be null"));
            } else {
                if (conversationId2 == null) {
                    conversationId2 = params.getConversationId();
                }
                success = new StartConversationDelegate.Result.Success(conversationId2, str2);
            }
            poeVar = success;
        }
        Throwable thA = roe.a(poeVar);
        return thA == null ? poeVar : new StartConversationDelegate.Result.Error(thA);
    }

    @Override // ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate
    public final StartConversationDelegate.Result invoke(StartConversationDelegate.Params params) {
        Object poeVar;
        if (!((wd4) this.b.getValue()).h() || !((onf) this.c.getValue()).isConnected()) {
            return new StartConversationDelegate.Result.Error(new ConnectionUnavailableException("no network"));
        }
        try {
            poeVar = (StartConversationDelegate.Result) yab.A0(k66.a, new r9c(this, params, null));
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            poeVar = new StartConversationDelegate.Result.Error(thA);
        }
        return (StartConversationDelegate.Result) poeVar;
    }
}
