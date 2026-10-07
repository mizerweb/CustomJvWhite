package defpackage;

import java.util.Iterator;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public interface rpa {
    List b();

    default int d(long j) {
        List listB = b();
        int size = listB.size();
        xw3.T0(listB.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iJ = cqk.j(((MessageModel) listB.get(i3)).c, j);
            if (iJ < 0) {
                i2 = i3 + 1;
            } else {
                if (iJ <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    default MessageModel h(long j) {
        Object next;
        Iterator it = b().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((MessageModel) next).a == j) {
                return (MessageModel) next;
            }
        }
        next = null;
        return (MessageModel) next;
    }
}
