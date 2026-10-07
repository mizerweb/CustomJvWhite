package androidx.recyclerview.widget;

import defpackage.bfe;
import defpackage.gm0;
import defpackage.lfe;
import defpackage.mua;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001a\u0010\u0018J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0014¢\u0006\u0004\b \u0010\u001f¨\u0006#"}, d2 = {"Landroidx/recyclerview/widget/MessagesRecyclerViewPool;", "Landroidx/recyclerview/widget/a;", "<init>", "()V", "", "viewType", "Lbfe;", "getScrapDataForType", "(I)Lbfe;", "max", "Lsbi;", "setMaxRecycledViews", "(II)V", "Llfe;", "getRecycledView", "(I)Llfe;", "getRecycledViewCount", "(I)I", "scrap", "putRecycledView", "(Llfe;)V", "", "createTimeNs", "factorInCreateTime", "(IJ)V", "bindTimeNs", "factorInBindTime", "approxCurrentNs", "deadlineNs", "", "willCreateInTime", "(IJJ)Z", "willBindInTime", "Companion", "mua", "message-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MessagesRecyclerViewPool extends a {
    public static final mua Companion = new mua();
    private static boolean ENABLED;

    public MessagesRecyclerViewPool() {
        ENABLED = true;
        setMaxRecycledViews(0, 10);
        setMaxRecycledViews(-2147483646, 10);
        setMaxRecycledViews(536870913, 20);
        setMaxRecycledViews(536870920, 10);
        setMaxRecycledViews(-1610612726, 10);
        setMaxRecycledViews(-1610612727, 10);
        setMaxRecycledViews(536870914, 10);
        setMaxRecycledViews(536870916, 10);
        setMaxRecycledViews(-1610612728, 10);
        setMaxRecycledViews(-1610612724, 10);
        setMaxRecycledViews(-1610612729, 10);
        setMaxRecycledViews(-1610612735, 10);
        setMaxRecycledViews(-1610612725, 10);
        setMaxRecycledViews(-1610612733, 10);
        setMaxRecycledViews(-1610612730, 10);
        setMaxRecycledViews(-1610612723, 10);
    }

    private final bfe getScrapDataForType(int viewType) {
        int i = viewType & (-2013265921);
        bfe bfeVar = this.mScrap.get(i);
        if (bfeVar != null) {
            return bfeVar;
        }
        bfe bfeVar2 = new bfe();
        this.mScrap.put(i, bfeVar2);
        return bfeVar2;
    }

    @Override // androidx.recyclerview.widget.a
    public void factorInBindTime(int viewType, long bindTimeNs) {
        bfe scrapDataForType = getScrapDataForType(viewType);
        scrapDataForType.d = runningAverage(scrapDataForType.d, bindTimeNs);
    }

    @Override // androidx.recyclerview.widget.a
    public void factorInCreateTime(int viewType, long createTimeNs) {
        bfe scrapDataForType = getScrapDataForType(viewType);
        scrapDataForType.c = runningAverage(scrapDataForType.c, createTimeNs);
    }

    @Override // androidx.recyclerview.widget.a
    public lfe getRecycledView(int viewType) {
        int size;
        bfe bfeVar = this.mScrap.get(viewType & (-2013265921));
        if (bfeVar == null) {
            return null;
        }
        ArrayList arrayList = bfeVar.a;
        if (arrayList.isEmpty() || (size = arrayList.size() - 1) < 0) {
            return null;
        }
        while (true) {
            int i = size - 1;
            if (!((lfe) arrayList.get(size)).o()) {
                return (lfe) arrayList.remove(size);
            }
            if (i < 0) {
                return null;
            }
            size = i;
        }
    }

    public int getRecycledViewCount(int viewType) {
        return getScrapDataForType(viewType).a.size();
    }

    @Override // androidx.recyclerview.widget.a
    public void putRecycledView(lfe scrap) {
        ArrayList arrayList = getScrapDataForType(scrap.f).a;
        if (this.mScrap.get(scrap.f & (-2013265921)).b > arrayList.size()) {
            scrap.x();
            arrayList.add(scrap);
        } else {
            gm0.Y("MessagesRecyclerViewPool", "could not add " + scrap);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public void setMaxRecycledViews(int viewType, int max) {
        bfe scrapDataForType = getScrapDataForType(viewType);
        scrapDataForType.b = max;
        ArrayList arrayList = scrapDataForType.a;
        while (arrayList.size() > max) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public boolean willBindInTime(int viewType, long approxCurrentNs, long deadlineNs) {
        long j = getScrapDataForType(viewType).d;
        return j == 0 || approxCurrentNs + j < deadlineNs;
    }

    @Override // androidx.recyclerview.widget.a
    public boolean willCreateInTime(int viewType, long approxCurrentNs, long deadlineNs) {
        long j = getScrapDataForType(viewType).c;
        return j == 0 || approxCurrentNs + j < deadlineNs;
    }
}
