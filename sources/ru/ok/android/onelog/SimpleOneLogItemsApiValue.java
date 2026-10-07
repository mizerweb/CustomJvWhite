package ru.ok.android.onelog;

import defpackage.mv8;
import defpackage.u21;
import java.io.IOException;
import java.util.Iterator;
import ru.ok.android.api.json.JsonSerializeException;

/* JADX INFO: loaded from: classes3.dex */
class SimpleOneLogItemsApiValue extends u21 {
    private final Iterable<OneLogItem> items;
    private final OneLogTrigger trigger;

    public SimpleOneLogItemsApiValue(Iterable<OneLogItem> iterable, OneLogTrigger oneLogTrigger) {
        this.items = iterable;
        this.trigger = oneLogTrigger;
    }

    @Override // defpackage.u21
    public void write(mv8 mv8Var) throws JsonSerializeException, IOException {
        mv8Var.r();
        Iterator<OneLogItem> it = this.items.iterator();
        while (it.hasNext()) {
            OneLogItemSerializer.INSTANCE.serialize(mv8Var, it.next());
        }
        OneLogTrigger oneLogTrigger = this.trigger;
        if (oneLogTrigger != null) {
            OneLogItemSerializer.INSTANCE.serialize(mv8Var, oneLogTrigger.toItem());
        }
        mv8Var.q();
    }
}
