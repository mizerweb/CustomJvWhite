package defpackage;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class ez7 {
    public final String a;
    public final String b = ez7.class.getName();
    public final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    public final ArrayList d;
    public final AtomicBoolean e;
    public boolean f;

    public ez7(String str, InetAddress[] inetAddressArr, boolean z) {
        ArrayList arrayList;
        this.a = str;
        boolean z2 = false;
        if (inetAddressArr != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (InetAddress inetAddress : inetAddressArr) {
                inetAddress = inetAddress.isAnyLocalAddress() ? null : inetAddress;
                if (inetAddress != null) {
                    linkedHashSet.add(inetAddress);
                }
            }
            arrayList = new ArrayList();
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(new cn8((InetAddress) it.next(), new fn8()));
            }
        } else {
            arrayList = new ArrayList();
        }
        this.d = arrayList;
        this.e = new AtomicBoolean(arrayList.isEmpty());
        if (z && inetAddressArr != null && (inetAddressArr.length == 0 || !arrayList.isEmpty())) {
            z2 = true;
        }
        this.f = z2;
    }

    public final InetAddress[] a() {
        ArrayList arrayList = this.d;
        ReentrantReadWriteLock.ReadLock lock = this.c.readLock();
        lock.lock();
        try {
            InetAddress[] inetAddressArr = null;
            if ((!arrayList.isEmpty() ? arrayList : null) != null) {
                int size = arrayList.size();
                inetAddressArr = new InetAddress[size];
                for (int i = 0; i < size; i++) {
                    inetAddressArr[i] = ((cn8) arrayList.get(i)).a;
                }
            }
            return inetAddressArr;
        } finally {
            lock.unlock();
        }
    }

    public final void b() {
        ReentrantReadWriteLock.WriteLock writeLock = this.c.writeLock();
        writeLock.lock();
        try {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                fn8 fn8Var = ((cn8) it.next()).b;
                fn8Var.b = 0;
                fn8Var.c = 0;
                fn8Var.d = 0;
            }
            this.e.set(true);
        } finally {
            writeLock.unlock();
        }
    }

    public final boolean c(InetAddress[] inetAddressArr) {
        String str = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, qv1.k("sync, host=", this.a), null);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        for (InetAddress inetAddress : inetAddressArr) {
            if (inetAddress.isAnyLocalAddress()) {
                inetAddress = null;
            }
            if (inetAddress != null) {
                linkedHashSet.add(inetAddress);
            }
        }
        if (linkedHashSet.isEmpty() && inetAddressArr.length != 0) {
            String str2 = this.b;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, a.h1(inetAddressArr, "\n", c0a.o("sync, an invalid addresses specified for ", this.a, ": (\n"), ")", dz7.b, 24), null);
                }
            }
            return false;
        }
        ReentrantReadWriteLock.WriteLock writeLock = this.c.writeLock();
        writeLock.lock();
        boolean z = false;
        while (i < this.d.size()) {
            try {
                if (linkedHashSet.remove(((cn8) this.d.get(i)).a)) {
                    i++;
                } else {
                    this.d.remove(i);
                    z = true;
                }
            } catch (Throwable th) {
                writeLock.unlock();
                throw th;
            }
        }
        if (!linkedHashSet.isEmpty()) {
            ArrayList arrayList = this.d;
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(new cn8((InetAddress) it.next(), new fn8()));
            }
            z = true;
        }
        this.f = true;
        writeLock.unlock();
        return z;
    }

    public final String toString() {
        ReentrantReadWriteLock.ReadLock lock = this.c.readLock();
        lock.lock();
        try {
            return ww3.z1(this.d, "\n", "Host(" + this.a + "|\n", ")", new x27(5), 24);
        } finally {
            lock.unlock();
        }
    }
}
