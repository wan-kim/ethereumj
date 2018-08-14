package org.ethereum.publish.event;

import org.ethereum.listener.EthereumListener;

public class SyncDone extends Event<EthereumListener.SyncState> implements Single {

    public SyncDone(EthereumListener.SyncState payload) {
        super(payload);
    }
}