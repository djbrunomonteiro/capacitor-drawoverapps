import { registerPlugin } from '@capacitor/core';

import type { capacitordrawoverappsPlugin } from './definitions';

const capacitordrawoverapps = registerPlugin<capacitordrawoverappsPlugin>('capacitordrawoverapps', {
  web: () => import('./web').then(m => new m.capacitordrawoverappsWeb()),
});

export * from './definitions';
export { capacitordrawoverapps };
