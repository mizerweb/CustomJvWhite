package org.apache.http.message;

import defpackage.ore;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class BasicListHeaderIterator implements HeaderIterator {
    protected final List allHeaders;
    protected int currentIndex;
    protected String headerName;
    protected int lastIndex;

    public BasicListHeaderIterator(List list, String str) {
        if (list == null) {
            ore.p("Header list must not be null.");
            throw null;
        }
        this.allHeaders = list;
        this.headerName = str;
        this.currentIndex = findNext(-1);
        this.lastIndex = -1;
    }

    public boolean filterHeader(int i) {
        if (this.headerName == null) {
            return true;
        }
        return this.headerName.equalsIgnoreCase(((Header) this.allHeaders.get(i)).getName());
    }

    public int findNext(int i) {
        if (i < -1) {
            return -1;
        }
        int size = this.allHeaders.size() - 1;
        boolean zFilterHeader = false;
        while (!zFilterHeader && i < size) {
            i++;
            zFilterHeader = filterHeader(i);
        }
        if (zFilterHeader) {
            return i;
        }
        return -1;
    }

    @Override // org.apache.http.HeaderIterator, java.util.Iterator
    public boolean hasNext() {
        return this.currentIndex >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() throws NoSuchElementException {
        return nextHeader();
    }

    @Override // org.apache.http.HeaderIterator
    public Header nextHeader() throws NoSuchElementException {
        int i = this.currentIndex;
        if (i < 0) {
            ore.f("Iteration already finished.");
            return null;
        }
        this.lastIndex = i;
        this.currentIndex = findNext(i);
        return (Header) this.allHeaders.get(i);
    }

    @Override // java.util.Iterator
    public void remove() throws UnsupportedOperationException {
        int i = this.lastIndex;
        if (i < 0) {
            ore.k("No header to remove.");
            return;
        }
        this.allHeaders.remove(i);
        this.lastIndex = -1;
        this.currentIndex--;
    }
}
