package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import one.video.calls.sdk_private.j;

/* JADX INFO: loaded from: classes3.dex */
public final class q3e extends gab {
    public final /* synthetic */ int a;
    public final ArrayList b;

    public q3e(ByteBuffer byteBuffer, int i) throws j {
        this.a = i;
        int i2 = 0;
        switch (i) {
            case 1:
                this.b = new ArrayList();
                int iA = a(byteBuffer, ifk.supported_groups.a, 4);
                short s = byteBuffer.getShort();
                if (iA != s + 2) {
                    p51.g("inconsistent length");
                    throw null;
                }
                if (s % 2 != 0) {
                    p51.g("invalid group length");
                    throw null;
                }
                while (i2 < s) {
                    Arrays.stream(kfk.values()).filter(new r4k(byteBuffer.getShort() % 65535, 5)).findFirst().ifPresent(new o01(24, this));
                    i2 += 2;
                }
                return;
            default:
                this.b = new ArrayList();
                int iA2 = a(byteBuffer, ifk.psk_key_exchange_modes.a, 2);
                byte b = byteBuffer.get();
                if (iA2 != b + 1) {
                    p51.g("inconsistent length");
                    throw null;
                }
                while (i2 < b) {
                    Arrays.stream(lfk.values()).filter(new r4k(byteBuffer.get(), 6)).findFirst().ifPresent(new Consumer() { // from class: a3e
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            this.a.b.add((lfk) obj);
                        }
                    });
                    i2++;
                }
                return;
        }
    }

    @Override // defpackage.gab
    public final byte[] b() {
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                short size = (short) (arrayList.size() + 1);
                final ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
                byteBufferAllocate.putShort(ifk.psk_key_exchange_modes.a);
                byteBufferAllocate.putShort(size);
                byteBufferAllocate.put((byte) arrayList.size());
                arrayList.forEach(new Consumer() { // from class: b3e
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        byteBufferAllocate.put(((lfk) obj).a);
                    }
                });
                return byteBufferAllocate.array();
            default:
                int size2 = arrayList.size() << 1;
                int i2 = size2 + 2;
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(size2 + 6);
                byteBufferAllocate2.putShort(ifk.supported_groups.a);
                byteBufferAllocate2.putShort((short) i2);
                byteBufferAllocate2.putShort((short) (arrayList.size() << 1));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    byteBufferAllocate2.putShort(((kfk) it.next()).a);
                }
                return byteBufferAllocate2.array();
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "SupportedGroupsExtension" + this.b;
            default:
                return super.toString();
        }
    }

    public q3e(lfk lfkVar) {
        this.a = 0;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(lfkVar);
    }

    public q3e(kfk kfkVar) {
        this.a = 1;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(kfkVar);
    }

    public q3e(lfk[] lfkVarArr) {
        this.a = 0;
        this.b = new ArrayList();
        for (int i = 0; i < 2; i++) {
            this.b.add(lfkVarArr[i]);
        }
    }
}
