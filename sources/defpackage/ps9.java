package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ps9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public ps9(i1m i1mVar, ss9 ss9Var, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 1;
        this.e = i1mVar;
        this.b = ss9Var;
        this.c = str;
        this.d = bundle;
        this.f = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.f;
        Object obj3 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                i1m i1mVar = (i1m) obj4;
                ms9 ms9Var = (ms9) ((y3a) i1mVar.a).e.get(((ss9) obj3).a.getBinder());
                if (ms9Var == null) {
                    lvb.G0("MBServiceCompat", "addSubscription for callback that isn't registered id=" + ((String) obj5));
                } else {
                    HashMap map = ms9Var.f;
                    y3a y3aVar = (y3a) i1mVar.a;
                    String str = (String) obj5;
                    IBinder iBinder = (IBinder) obj2;
                    Bundle bundle = (Bundle) obj;
                    List<amc> arrayList = (List) map.get(str);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    for (amc amcVar : arrayList) {
                        if (iBinder == amcVar.a) {
                            Bundle bundle2 = (Bundle) amcVar.b;
                            if (bundle == bundle2) {
                                break;
                            } else if (bundle == null) {
                                bundle2.getClass();
                                if (bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1) {
                                    break;
                                }
                            } else if (bundle2 != null) {
                                if (bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1)) {
                                    break;
                                }
                            } else if (bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1) {
                                break;
                            }
                        }
                    }
                    arrayList.add(new amc(iBinder, bundle));
                    map.put(str, arrayList);
                    ls9 ls9Var = new ls9(y3aVar, str, ms9Var, str, bundle);
                    y3aVar.f = ms9Var;
                    if (bundle == null) {
                        ls9Var.b();
                    } else {
                        ls9Var.b = 1;
                        ls9Var.b();
                    }
                    y3aVar.f = null;
                    if (ls9Var.c) {
                        y3aVar.f = null;
                    } else {
                        ore.k(qt4.q(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), ms9Var.a, " id=", str));
                    }
                }
                break;
            case 1:
                Bundle bundle3 = (Bundle) obj;
                i1m i1mVar2 = (i1m) obj4;
                ms9 ms9Var2 = (ms9) ((y3a) i1mVar2.a).e.get(((ss9) obj3).a.getBinder());
                if (ms9Var2 == null) {
                    lvb.G0("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + ((String) obj5) + ", extras=" + bundle3);
                } else {
                    y3a y3aVar2 = (y3a) i1mVar2.a;
                    ResultReceiver resultReceiver = (ResultReceiver) obj2;
                    y3aVar2.f = ms9Var2;
                    if (bundle3 == null) {
                        Bundle bundle4 = Bundle.EMPTY;
                    }
                    resultReceiver.send(-1, null);
                    y3aVar2.f = null;
                }
                break;
            default:
                View view = (View) obj5;
                kzf kzfVar = (kzf) obj4;
                ArrayList arrayList2 = kzfVar.h;
                View view2 = (View) obj3;
                WeakHashMap weakHashMap = i7j.a;
                arrayList2.remove(y6j.f(view2));
                kzfVar.i.add(new jzf(view2, (ViewGroup) view2.getParent()));
                ((ViewGroup) view2.getParent()).removeView(view2);
                if (arrayList2.size() == 0) {
                    view.getViewTreeObserver().removeOnPreDrawListener((ezf) obj2);
                    view.setVisibility(4);
                    ((ll5) obj).c();
                }
                break;
        }
    }

    public /* synthetic */ ps9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.f = obj4;
        this.d = obj5;
    }
}
