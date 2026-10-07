package defpackage;

import android.content.SharedPreferences;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.function.Function;
import one.me.sdk.net.client.impl.internal.SocketFactoryCreateException;
import ru.ok.tamtam.messages.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mm implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mm(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) throws Exception {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return (f9b) ((c6) obj2).invoke(obj);
            case 1:
                return (int[][]) ((z9) obj2).invoke(obj);
            case 2:
                gl6 gl6Var = (gl6) obj2;
                String str = (String) obj;
                try {
                    gl6Var.a.b.getClass();
                    return gl6Var.c.a(str);
                } catch (IOException e) {
                    throw new SocketFactoryCreateException(e);
                }
            case 3:
                return (f9b) ((fn3) obj2).invoke(obj);
            case 4:
                return (f9b) ((lh3) obj2).invoke(obj);
            case 5:
                return (f9b) ((fn3) obj2).invoke(obj);
            case 6:
                return (f9b) ((lh3) obj2).invoke(obj);
            case 7:
                return (f9b) ((ol) obj2).invoke(obj);
            case 8:
                return (f9b) ((g3) obj2).invoke(obj);
            case 9:
                return (vo8) ((aa) obj2).invoke(obj);
            case 10:
                return (ExecutorService) ((ol) obj2).invoke(obj);
            case 11:
                return (qn) ((k4c) obj2).invoke(obj);
            case 12:
                return (Integer) ((q4c) obj2).invoke(obj);
            case 13:
                ((ol) obj2).invoke(obj);
                return null;
            case 14:
                return (ThreadFactory) ((qbc) obj2).invoke(obj);
            case 15:
                return (usc) ((vsc) obj2).invoke(obj);
            case 16:
                return (c) ((tcd) obj2).invoke(obj);
            case 17:
                return (f9b) ((g3) obj2).invoke(obj);
            case 18:
                return (SharedPreferences) ((ol) obj2).invoke(obj);
            default:
                return (lbj) ((jl3) obj2).invoke(obj);
        }
    }
}
