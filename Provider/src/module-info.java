import provider.Service;
import provider.impl.ServiceImpl;

// allowed/supposed to be dotted name type
// e.g. com.simon.provider (note, this means directories
// containing dots!!!)
/*open*/ module Provider {
  exports provider;
//  exports provider to Consumer, NonExistent;
//  exports provider.impl;
  provides provider.Service with provider.impl.ServiceImpl;
  opens provider.impl to Consumer, NonExistent;
}
