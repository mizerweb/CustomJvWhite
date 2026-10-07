package androidx.work.impl.model;

import defpackage.j0k;
import defpackage.lq4;
import defpackage.vzj;
import defpackage.ww3;
import defpackage.yw3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\bH'¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000e\u0010\u0010J'\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\rH'¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0015\u0010\u000fJ\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0017\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\rH'¢\u0006\u0004\b\u0017\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001b\u0010\u0006J\u001d\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0017¢\u0006\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Landroidx/work/impl/model/WorkersQueueDao;", "", "Lvzj;", DatabaseHelper.ITEM_COLUMN_NAME, "Lsbi;", "insertOrIgnore", "(Lvzj;)V", "insertOrReplace", "", "state", "count", "(I)I", "limit", "", "select", "(I)Ljava/util/List;", "(II)Ljava/util/List;", "", "ids", "updateState", "(ILjava/util/List;)V", "getItemsForRunning", "id", "delete", "(Ljava/lang/String;Llq4;)Ljava/lang/Object;", "(Ljava/util/List;)V", "workerQueueItem", "insert", "", "contains", "(Ljava/util/List;)Z", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface WorkersQueueDao {
    default boolean contains(List<String> ids) {
        List<vzj> listSelect = select(ids.size());
        ArrayList arrayList = new ArrayList(yw3.W0(listSelect, 10));
        Iterator<T> it = listSelect.iterator();
        while (it.hasNext()) {
            arrayList.add(((vzj) it.next()).a);
        }
        return ww3.R1(arrayList).containsAll(ww3.X1(ids));
    }

    int count(int state);

    Object delete(String str, lq4 lq4Var);

    void delete(List<String> ids);

    default List<vzj> getItemsForRunning(int limit) {
        List<vzj> listSelect = select(limit, 0);
        List<vzj> list = listSelect;
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((vzj) it.next()).a);
        }
        updateState(1, arrayList);
        return listSelect;
    }

    default void insert(vzj workerQueueItem) {
        if (j0k.$EnumSwitchMapping$0[workerQueueItem.c.ordinal()] == 1) {
            insertOrIgnore(workerQueueItem);
        } else {
            insertOrReplace(workerQueueItem);
        }
    }

    void insertOrIgnore(vzj item);

    void insertOrReplace(vzj item);

    List<vzj> select(int limit);

    List<vzj> select(int limit, int state);

    void updateState(int state, List<String> ids);
}
