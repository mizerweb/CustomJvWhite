package androidx.recyclerview.widget;

import android.util.SparseArray;
import defpackage.bfe;
import defpackage.lfe;
import defpackage.nee;
import defpackage.ore;
import defpackage.rx8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static final int DEFAULT_MAX_SCRAP = 5;
    SparseArray<bfe> mScrap = new SparseArray<>();
    int mAttachCountForClearing = 0;
    Set<nee> mAttachedAdaptersForPoolingContainer = Collections.newSetFromMap(new IdentityHashMap());

    public void attach() {
        this.mAttachCountForClearing++;
    }

    public void attachForPoolingContainer(nee neeVar) {
        this.mAttachedAdaptersForPoolingContainer.add(neeVar);
    }

    public void clear() {
        for (int i = 0; i < this.mScrap.size(); i++) {
            bfe bfeVarValueAt = this.mScrap.valueAt(i);
            Iterator it = bfeVarValueAt.a.iterator();
            while (it.hasNext()) {
                rx8.l(((lfe) it.next()).a);
            }
            bfeVarValueAt.a.clear();
        }
    }

    public void detach() {
        this.mAttachCountForClearing--;
    }

    public void detachForPoolingContainer(nee neeVar, boolean z) {
        this.mAttachedAdaptersForPoolingContainer.remove(neeVar);
        if (this.mAttachedAdaptersForPoolingContainer.size() != 0 || z) {
            return;
        }
        for (int i = 0; i < this.mScrap.size(); i++) {
            SparseArray<bfe> sparseArray = this.mScrap;
            ArrayList arrayList = sparseArray.get(sparseArray.keyAt(i)).a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                rx8.l(((lfe) arrayList.get(i2)).a);
            }
        }
    }

    public void factorInBindTime(int i, long j) {
        bfe scrapDataForType = getScrapDataForType(i);
        scrapDataForType.d = runningAverage(scrapDataForType.d, j);
    }

    public void factorInCreateTime(int i, long j) {
        bfe scrapDataForType = getScrapDataForType(i);
        scrapDataForType.c = runningAverage(scrapDataForType.c, j);
    }

    public lfe getRecycledView(int i) {
        bfe bfeVar = this.mScrap.get(i);
        if (bfeVar == null) {
            return null;
        }
        ArrayList arrayList = bfeVar.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((lfe) arrayList.get(size)).o()) {
                return (lfe) arrayList.remove(size);
            }
        }
        return null;
    }

    public final bfe getScrapDataForType(int i) {
        bfe bfeVar = this.mScrap.get(i);
        if (bfeVar != null) {
            return bfeVar;
        }
        bfe bfeVar2 = new bfe();
        this.mScrap.put(i, bfeVar2);
        return bfeVar2;
    }

    public void onAdapterChanged(nee neeVar, nee neeVar2, boolean z) {
        if (neeVar != null) {
            detach();
        }
        if (!z && this.mAttachCountForClearing == 0) {
            clear();
        }
        if (neeVar2 != null) {
            attach();
        }
    }

    public void putRecycledView(lfe lfeVar) {
        int i = lfeVar.f;
        ArrayList arrayList = getScrapDataForType(i).a;
        if (this.mScrap.get(i).b <= arrayList.size()) {
            rx8.l(lfeVar.a);
        } else if (RecyclerView.Z1 && arrayList.contains(lfeVar)) {
            ore.p("this scrap item already exists");
        } else {
            lfeVar.x();
            arrayList.add(lfeVar);
        }
    }

    public long runningAverage(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        return (j2 / 4) + ((j / 4) * 3);
    }

    public void setMaxRecycledViews(int i, int i2) {
        bfe scrapDataForType = getScrapDataForType(i);
        scrapDataForType.b = i2;
        ArrayList arrayList = scrapDataForType.a;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < this.mScrap.size(); i++) {
            ArrayList arrayList = this.mScrap.valueAt(i).a;
            if (arrayList != null) {
                size = arrayList.size() + size;
            }
        }
        return size;
    }

    public boolean willBindInTime(int i, long j, long j2) {
        long j3 = getScrapDataForType(i).d;
        return j3 == 0 || j + j3 < j2;
    }

    public boolean willCreateInTime(int i, long j, long j2) {
        long j3 = getScrapDataForType(i).c;
        return j3 == 0 || j + j3 < j2;
    }
}
