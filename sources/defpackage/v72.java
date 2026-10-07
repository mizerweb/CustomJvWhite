package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import one.me.polls.screens.create.PollCreateScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class v72 implements Runnable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v72(j46 j46Var, int i) {
        this(Arrays.asList(j46Var), i, (Throwable) null);
        this.a = 1;
        qyj.k(j46Var, "initCallback cannot be null");
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                gm0 gm0Var = (gm0) ((g9i) obj).a;
                if (gm0Var != null) {
                    gm0Var.G(i2);
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((j46) arrayList.get(i3)).b();
                        i3++;
                    }
                } else {
                    while (i3 < size) {
                        ((j46) arrayList.get(i3)).a();
                        i3++;
                    }
                }
                break;
            case 2:
                zv8[] zv8VarArr = PollCreateScreen.n;
                ((PollCreateScreen) obj).o1().w0(i2);
                break;
            case 3:
                ((RecyclerView) obj).A0(i2);
                break;
            default:
                ((skk) obj).f(i2);
                break;
        }
    }

    public v72(int i, w8j w8jVar) {
        this.a = 3;
        this.b = i;
        this.c = w8jVar;
    }

    public /* synthetic */ v72(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public v72(List list, int i, Throwable th) {
        this.a = 1;
        qyj.k(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i;
    }
}
